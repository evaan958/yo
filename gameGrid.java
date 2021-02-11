//Evaan J 
//Feb 7
//Final project - The Game of Life

public class gameGrid extends matrix {
    
    public void rowUpdate (){
        
        rowUpdate = user;
        data.outputSet("What is the column of organism " + (1+w) +" ?");
 
        
    }
    public void colUpdate (){
        
        colUpdate = user;
        gameGrid.cellUpdate();
    }
    public void cellUpdate(){
        
        cor1[rowUpdate][colUpdate] = true;
        w++;
        matrix.row();
          
    }
    public void nextGen(){
        
        int h=0;
        
        //Creating a for loop that will loop code a certain number of times
        for(int p=0; p<rowValue-1 ; p++){
            for(int k=0; k<colValue-1 ; k++){
                for(int j=-1+p; j<2+p; j++){
                    for(int i=-1+k; i<2+k; i++){
                        
                        //Using try catch to catch places where the code might fail; where the code is called to check 
                        //the negative direction of the 2d array
                        try{
                            if (cor1[j][i]){
                                h++;
                            }
                        }catch(Exception e){
                            
                        }
                    }  
                } 

                if (cor1[p][k] && h==4){
                    //Setting a cell in the array to true 
                    cor1[p][k]=true;
                }else if (cor1[p][k] && h<3){
                    ////Setting a cell in the array to true 
                    cor1[p][k]=false;
                }else if (cor1[p][k] && h>4){
                    cor1[p][k]=false;
                }else if (!cor1[p][k] && h==3){
                    cor1[p][k]=true;
                }else if (!cor1[p][k] && h<2){
                    cor1[p][k]=false;
                }else if (!cor1[p][k] && h>3){
                    cor1[p][k]=false;
                }
                h=0;
                
            }
        }
        
    } 
    public void print (){
        
        //Creating a StringBuilder that will take multiple inputs to create a string
        StringBuilder s = new StringBuilder ();
        
        for(int w=0; w<rowValue ; w++){
            for(int j=0; j<colValue ; j++){

                //Printing out the column values of row "w"
                if(cor1 [w][j]){
                    s.append("*     ");
                }else {
                    s.append(".     ");
                }
            }
            System.out.println();
            System.out.println();
        }
        
        //Setting the StringBuilder equivilent to a String
        String array = s.toString();
        
        print.print(array);
        print.setVisible(true);
    }
    public void forward (){
        
        int j = 0;
        
        matrix.lead();
        j++;
        
        if(j>genValue){
            print.setVisible(false);
            
            
        }
    }












    
}
