
package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabelaIptu extends AbstractTableModel{
    
   private ArrayList linhas = null;
        private String [] colunas = null;
        
        
        public ModeloTabelaIptu(ArrayList lin , String [] col )
        {
            setLinhas (lin);
            setColunas (col);
            
        }
        
        public ArrayList getLinhas (){
            return linhas;
        }
        public void setLinhas (ArrayList dados ){
            linhas  = dados;
        }
        public String [] getColunas (){
            return colunas;
        }
        public void setColunas (String[] nomes){
            colunas = nomes;
        }
        public int getColumnCount(){
            return colunas.length;
        }
        public int getRowCount(){
            return linhas.size();
        }
        public String getColumnName (int numCol){
            return colunas[numCol];
    }
        public Object getValueAt(int numLin , int numCol){
            Object [] linhas  = (Object[])getLinhas().get(numLin);
            return linhas [numCol];
        }   
  
}
