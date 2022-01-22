package de.quantumrange.betterCollapse;

import com.intellij.ide.projectView.TreeStructureProvider;
import com.intellij.ide.projectView.ViewSettings;
import com.intellij.ide.projectView.impl.nodes.PsiDirectoryNode;
import com.intellij.ide.util.treeView.AbstractTreeNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class QTreeStructureProvider implements TreeStructureProvider {

	@NotNull
	@Override
	public Collection<AbstractTreeNode<?>> modify(@NotNull AbstractTreeNode<?> parent,
												  @NotNull Collection<AbstractTreeNode<?>> children,
												  ViewSettings settings) {
		List<AbstractTreeNode<?>> nodes = new ArrayList<>();

		for (AbstractTreeNode<?> child : children) {
			if (child instanceof PsiDirectoryNode) {
				PsiDirectoryNode node = (PsiDirectoryNode) child;

			}

			nodes.add(child);
		}

		return nodes;
	}

	@Nullable
	@Override
	public Object getData(@NotNull Collection<AbstractTreeNode<?>> selected, @NotNull String dataId) {
		return null;
	}

}