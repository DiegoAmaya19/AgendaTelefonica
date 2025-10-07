import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { ViewGetComponent } from './Component/view-get/view-get.component';
import { ViewPostComponent } from './Component/view-post/view-post.component';

export const routes: Routes = [
    {path: '', component:AppComponent},
    {path: 'viewGetRuta', component:ViewGetComponent},
    {path: 'viewPostRuta', component:ViewPostComponent}
];
