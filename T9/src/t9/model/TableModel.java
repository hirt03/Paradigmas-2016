/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9.model;

import t9.model.Dados;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Hirt
 */
public class TableModel extends AbstractTableModel{
    
    private static final String[] columnNames = {"num", "foto", "ID", "nome"};
    
    private ArrayList<Dados> data;
    
    public TableModel(){
        data = new ArrayList<Dados>();
    }
    
    
    public void add(Dados d) {
    // Adds the element in the last position in the list
    data.add(d);
    fireTableRowsInserted(data.size()-1, data.size()-1);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: return data.get(rowIndex).getNum();
            case 1: return data.get(rowIndex).getFoto();
            case 2: return data.get(rowIndex).getID();
            case 3: return data.get(rowIndex).getNome();
        }
        return null;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    
}
