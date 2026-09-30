import { Address } from "./address";

export interface UserProfile {
    id?: number;
    name: string;
    email?: string;
    phone?: string;
    imgUrl?: string;
    addresses?: Address[];
}
