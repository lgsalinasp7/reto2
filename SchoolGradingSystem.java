import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
public class SchoolGradingSystem {
       
    int cr=0,j=0,indice=0;//variablesble de la cantidad de notas
    double men=0;
    int calinsu= 0;
    String val1="";
    String val2="";
    double pronotas=0;
    double prolite=0,probio=0,progeo=0;
    int canlite=0,canbio=0,cangeo=0;
    String n1;
    double nombre; // nombres estudiantes
    double genero; // genero estudiantes
    double materia;// materia estudiantes
    double nota; // nota estudiantes
    double [][] tablanotas; //matriz objetos
    String [] lineanotas;
    double [] estudiante;

  
    public void readData(){
        Scanner leer = new Scanner(System.in);
        this.cr= Integer.parseInt(leer.nextLine());
        tablanotas = new double[cr][4];
        lineanotas = new String [cr];
        estudiante = new double [6];
        for(int i=0;i< cr;i++){
            String linea=leer.nextLine();
            lineanotas= linea.split(" ");
            for(int j=0;j<4;j++)
            {
                 tablanotas[i][j]=Double.parseDouble(lineanotas[j]); 
            } //fin for j
        }//fin for i    
   
    leer.close();      
    }
    
     //pregunta 1
    public void question1(){
        
        for(int i=0;i< cr;i++){
            pronotas = pronotas + tablanotas[i][3];
            }//fin for i 
             pronotas = (pronotas/cr);
             DecimalFormatSymbols separator= new DecimalFormatSymbols();
             separator.setDecimalSeparator('.');
             DecimalFormat f = new DecimalFormat("0.00",separator);   
             System.out.println( f.format(pronotas));//3.80
            
    }    
    //pregunta 2
    public void question2(){
        for(int i=0;i< cr;i++){
         if (tablanotas[i][3] > 3.0  && tablanotas[i][3] <= 6.0) {
            calinsu = calinsu +1; 
          } //fin if
        }//fin for i 

        System.out.println(calinsu); 



    }
    //cual es la materia con el mejor desempeño  promedio para el genero femenino
    public String question3(){
        for(int i=0;i< cr;i++){
          if (tablanotas[i][1] == 1) {
            if (tablanotas [i][2] == 1){
                prolite =prolite + tablanotas[i][3]; 
                canlite = canlite +1;
            }
            if (tablanotas [i][2] == 2){
                probio = probio + tablanotas[i][3]; 
                canbio = canbio +1;
                }
            if (tablanotas [i][2] == 3){
                progeo = progeo + tablanotas[i][3]; 
                cangeo = cangeo +1;
            } 
          } 
        }//fin for i 
       prolite = (prolite/canlite);
       probio =(probio/canbio);
       progeo =(progeo/cangeo);
       if(prolite >= probio){
        if (prolite == probio && prolite > progeo ){
            val1= "literatura" ;
            return this.val1;
        }  
        if (prolite>progeo){
            val1= "literatura" ;
            //return this.val1;
         }  
        }
        
       if (probio >= progeo ){
          if (probio == progeo && probio > prolite ){
             val1= "biologia"; 
             //return this.val1;
          } 
          if (probio>prolite){
             val1="biologia";
             //return this.val1;
          }
        }

       if (progeo>prolite && progeo>probio){
            val1="geografia";
            //return this.val1;
       }
     return val1;
    }     

     
    //Cuál es el estudiante con el mejor desempeño para la materia literatura?
    public String question4(){
       
       for(int i=0;i<cr;i++){
        if (tablanotas[i][2] == 1){ 
            if (tablanotas[i][0]== 1){
                estudiante[j] = tablanotas[i][3];
                j=j+1; 
            }
            if (tablanotas[i][0]== 2){
                estudiante[j] = tablanotas[i][3];
                j=j+1;     
            }
            if (tablanotas[i][0]== 3){
                estudiante[j] = tablanotas[i][3];        
                j=j+1; 
            }
            if (tablanotas[i][0]== 4){
                estudiante[j] = tablanotas[i][3];
                j=j+1; 
            }        
            if (tablanotas[i][0]== 5){
                estudiante[j] = tablanotas[i][3];        
                j=j+1; 
            }
            if(tablanotas[i][0]== 6){
                estudiante[j] = tablanotas[i][3];    
                j=j+1; 
            }
        }    
      }   
        
      
      for(int i=0;i< j;i++) {
        if(estudiante[i] > men) {
           men = estudiante[i];
           indice =i;    
        }
       }    
        
       if(indice==0)
        val2 ="armando";
        
       if(indice==1)
        val2= "nicolas";
        
       if(indice==2)
        val2="daniel";
        
       if(indice==3)
        val2="maria";
        
       if(indice==4)
        val2 ="marcela";
        
       if(indice==5)
        val2="alexandra";
        




    return val2;   
    }
    
    
    
    
    
    
 }//end class 





        

