import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(private httpService: HttpService) { }
  productData:any;
  ngOnInit() {
    this.httpService.getProducts()
    .subscribe((data) => {
     this.productData = data;
     console.log(this.productData)
     }); 
  }
}
