import { Component, OnInit } from '@angular/core';
import { Blog } from 'src/app/models/blog';
import { DataControllerService } from 'src/app/service/data-controller.service';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})
export class BlogComponent implements OnInit {

  blogId:any;
  heading:any;
  blogpost:any;
  post:any;
  allpost:any=[];
  constructor(private myservice:DataControllerService) {
    this.myservice.allpost().subscribe((x)=>{
      this.allpost=x;
    })
   }

  ngOnInit(): void {
  }

  createpost(){
    this.post= new Blog(this.blogId,this.heading,this.blogpost);
    

    this.myservice.createpost(this.post).subscribe(()=>{
      alert("Posted")
    });
  }

  
}
