package com.mycompany.ipk;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
public class TableModelMatakuliah extends AbstractTableModel {
    
    private List<Matakuliah> matakuliahs;
    
    public TableModelMatakuliah(){
        matakuliahs = new ArrayList<>();
    }
    public TableModelMatakuliah(List<Matakuliah>items){
        this.matakuliahs =items;
    }

    @Override
    public int getRowCount() {
        return matakuliahs.size();
    }
 
    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Matakuliah matakuliah = matakuliahs.get(rowIndex);
        switch (columnIndex){
            case 0: return matakuliah.getNama();
            case 1: return matakuliah.getSks();
            case 2: return matakuliah.getNilai();
        }
        return null;
    }
    public Class<?>getColunnClass(int columnIndex){
        switch (columnIndex){
            case 0: return Integer.class;
            case 1: return String.class;
            case 2: return Integer.class ;
            case 3: return String.class;
        }
        return Object.class;
        
    }
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Matakuliah";
            case 1: return "SKS";
            case 2: return "NILAI";
        }
        return null;  
    }
    
  public void add(Matakuliah item){
      matakuliahs.add(item);
      int row=matakuliahs.indexOf(item);
      fireTableRowsInserted(row,row);  
  }  
  
  public void remove(Matakuliah item){
      if(matakuliahs.contains(item)){
          int row = matakuliahs.indexOf(item);
          matakuliahs.remove(row);
          fireTableRowsInserted(row,row); 
      }
  }
  
  public List<Matakuliah> getMatakuliahs(){
      return this.matakuliahs;
  }
    
}
