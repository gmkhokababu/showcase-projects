export class Class {
    classId:any;
    className:any;
    academicYear:any;
    classPosition:any;
    languageVersion:any;
    studentIdStart:any;
    numberOfseat:any;
    shift:any;

  constructor(id:any,name:any,year:any,position:any,version:any,start:any,seat:any,shift:any){

    this.classId=id;
    this.className=name;
    this.academicYear=year;
    this.classPosition=position;
    this.languageVersion=version;
    this.studentIdStart=start;
    this.numberOfseat=seat;
    this.shift=shift;
  }
}
