/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canadiancaloriecounting;

/**
 *
 * @author Stephie
 */
import java.util.*;
public class CanadianCalorieCounting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int burger = input.nextInt();
        int sidechoice = input.nextInt();
        int drink = input.nextInt();
        int dessert = input.nextInt();
        if(burger == 1){
            int caloriecount = 461;
            if(sidechoice == 1){
                caloriecount = caloriecount+100;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
            }
            if(sidechoice == 2){
                caloriecount = caloriecount+57;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
            if(sidechoice == 3){
                caloriecount = caloriecount+70;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
            if(sidechoice == 4){
                caloriecount = caloriecount+0;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
        }
        if(burger == 2){
            int caloriecount = 431;
            if(sidechoice == 1){
                caloriecount = caloriecount+100;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
            }
            if(sidechoice == 2){
                caloriecount = caloriecount+57;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
            if(sidechoice == 3){
                caloriecount = caloriecount+70;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
            if(sidechoice == 4){
                caloriecount = caloriecount+0;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
        }
        if(burger ==3){
            int caloriecount = 420;
            if(sidechoice == 1){
                caloriecount = caloriecount+100;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
            }
            if(sidechoice == 2){
                caloriecount = caloriecount+57;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
            if(sidechoice == 3){
                caloriecount = caloriecount+70;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
            if(sidechoice == 4){
                caloriecount = caloriecount+0;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
        }
        if(burger == 4){
            int caloriecount = 0;
            if(sidechoice == 1){
                caloriecount = caloriecount+100;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
            }
            if(sidechoice == 2){
                caloriecount = caloriecount+57;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
            if(sidechoice == 3){
                caloriecount = caloriecount+70;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }

            }
            if(sidechoice == 4){
                caloriecount = caloriecount+0;
                if(drink == 1){
                    caloriecount = caloriecount+130;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 2){
                    caloriecount = caloriecount+160;
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 3){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
                if(drink == 4){
                    if(dessert ==1){
                        caloriecount = caloriecount+167;                  
                    }  
                    if(dessert == 2){
                        caloriecount = caloriecount+266;
                    }
                    if(dessert == 3){
                        caloriecount = caloriecount+75;
                    }
                    if(dessert == 4){
                        caloriecount = caloriecount+0;
                    }
                }
            }
            System.out.println(caloriecount);
        }
    }
    
}
