package de.quantumrange.betterCollapse;

import com.intellij.ide.projectView.ProjectView;
import com.intellij.ide.projectView.impl.ProjectViewPane;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.ProjectUtil;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import javax.swing.tree.TreePath;

public class CollapseAction extends AnAction {

	@Override
	public void actionPerformed(@NotNull AnActionEvent e) {
		VirtualFile file = CommonDataKeys.VIRTUAL_FILE.getData(e.getDataContext());

		for (QProjectView view : QProjectView.views) {
			if (view.getProjectName().equals(e.getProject().getName())) {
				JTree tree = view.getTree();
				TreePath path = tree.getSelectionPath().getParentPath();

				if (path != null && path.getPathCount() != 1) tree.collapsePath(path);

				break;
			}
		}
	}

}
