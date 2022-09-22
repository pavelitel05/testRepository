package sea_battle;

public class Rules {
    public boolean isNear(int x, int y, int size, int verticalId, int[][] selfArea) {
        x -= 1;
        y -= 1;
        boolean isNearVar = false;
        if(verticalId == 1){
            if((y + size) > 10){
                isNearVar = true;
                return isNearVar;
            }
            for(int i = -1; i < size + 1; i++){
                try{
                    if(selfArea[x+1][y+i] != 1){
                        try{
                            if(selfArea[x-1][y+i] !=1){
                                try{
                                    if(selfArea[x][y] != 1){
                                        continue;
                                    }else{
                                        isNearVar = true;
                                        break;
                                    }
                                }catch(ArrayIndexOutOfBoundsException exception){
                                    continue;
                                }
                            }else{
                                isNearVar = true;
                                break;
                            }
                        }catch(ArrayIndexOutOfBoundsException exception){
                            try{
                                if(selfArea[x][y] != 1){
                                    continue;
                                }else{
                                    isNearVar = true;
                                    break;
                                }
                            }catch(ArrayIndexOutOfBoundsException e){
                                continue;
                            }
                        }
                    }else{
                        isNearVar = true;
                        break;
                    }
                }catch(ArrayIndexOutOfBoundsException exception){
                    try{
                        if(selfArea[x-1][y+i] !=1){
                            try{
                                if(selfArea[x][y] != 1){
                                    continue;
                                }else{
                                    isNearVar = true;
                                    break;
                                }
                            }catch(ArrayIndexOutOfBoundsException e){
                                continue;
                            }
                        }else{
                            isNearVar = true;
                            break;
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                        try{
                            if(selfArea[x][y] != 1){
                                continue;
                            }else{
                                isNearVar = true;
                                break;
                            }
                        }catch(ArrayIndexOutOfBoundsException ex){
                            continue;
                        }
                    }
                }
            }
        }else if(verticalId == 0){
            if((x + size) > 10){
                isNearVar = true;
                return isNearVar;
            }
            for(int i = -1; i < size + 1; i++){
                try{
                    if(selfArea[x+i][y+1] != 1){
                        try{
                            if(selfArea[x+i][y-1] !=1){
                                try{
                                    if(selfArea[x][y] != 1){
                                        continue;
                                    }else{
                                        isNearVar = true;
                                        break;
                                    }
                                }catch(ArrayIndexOutOfBoundsException exception){
                                    continue;
                                }
                            }else{
                                isNearVar = true;
                                break;
                            }
                        }catch(ArrayIndexOutOfBoundsException exception){
                            try{
                                if(selfArea[x][y] != 1){
                                    continue;
                                }else{
                                    isNearVar = true;
                                    break;
                                }
                            }catch(ArrayIndexOutOfBoundsException e){
                                continue;
                            }
                        }
                    }else{
                        isNearVar = true;
                        break;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    try{
                        if(selfArea[x+i][y-1] != 1){
                            try{
                                if(selfArea[x][y] != 1){
                                    continue;
                                }else{
                                    isNearVar = true;
                                    break;
                                }
                            }catch(ArrayIndexOutOfBoundsException exception){
                                continue;
                            }
                        }else{
                            isNearVar = true;
                            break;
                        }
                    }catch(ArrayIndexOutOfBoundsException exception){
                        try{
                            if(selfArea[x][y] != 1){
                                continue;
                            }else{
                                isNearVar = true;
                                break;
                            }
                        }catch(ArrayIndexOutOfBoundsException ex){
                            continue;
                        }
                    }
                }
            }
        }
        return isNearVar;
    }
}
