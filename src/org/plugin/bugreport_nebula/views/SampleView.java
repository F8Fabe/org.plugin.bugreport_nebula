package org.plugin.bugreport_nebula.views;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.nebula.jface.tablecomboviewer.TableComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * @author Fabian Ceolotto
 *
 */
public class SampleView extends ViewPart {

  public SampleView() {}

  @Override
  public void setFocus() {}

  @Override
  public void createPartControl(Composite parent) {
    String[] myStringArray = {"1", "2", "3"};
    TableComboViewer comboViewer = new TableComboViewer(parent, SWT.READ_ONLY | SWT.BORDER);
    comboViewer.setContentProvider(ArrayContentProvider.getInstance());
    comboViewer.setInput(myStringArray);
  }

}
