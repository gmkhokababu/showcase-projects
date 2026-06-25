import { Permission } from "./permission";
import { Role } from "./role";
import { UserProfile } from "./user-profile";

export interface User {
    id?: number;  
    username: string;    
    password?: string;
    active?: boolean;   
    isLocked?: boolean;   
    roles?: Role[];
    permissions?: Permission[];
    userProfile?: UserProfile;
}
