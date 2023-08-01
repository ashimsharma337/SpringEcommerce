import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProductsComponent } from './products/products.component';
import { CartComponent } from './cart/cart.component';

const routes: Routes = [
  { path: 'home', component: DashboardComponent},
  { path: 'about', component: DashboardComponent},
  { path: 'products', component: ProductsComponent},
  { path: 'search', component: DashboardComponent},
  { path: 'signup', component: DashboardComponent},
  { path: 'cart', component: CartComponent },
  { path: 'order', component: DashboardComponent },
  { path: 'payment', component: DashboardComponent },
  { path: 'history', component: DashboardComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
