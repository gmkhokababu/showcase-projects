export interface Address {
    id?: number;
    addressType: string;    // e.g., "SHIPPING", "BILLING"
    streetAddress: string;
    city: string;
    district: string;
    division: string;
    zipCode?: string;
    country: string;
}
