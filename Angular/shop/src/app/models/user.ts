export interface User {
    id?: number;
    name?: string;       
    username: string;    
    password?: string;
    active?: boolean;   
    imgUrl?: string;     
    roles?: any[];
}
