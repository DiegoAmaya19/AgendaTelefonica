import { Routes } from '@angular/router';
import { ViewGetComponent } from './Component/view-get/view-get.component';
import { ViewPostComponent } from './Component/view-post/view-post.component';
import { MainComponent } from './Component/view-main/main/main.component';

export const routes: Routes = [
    {path: '', component: MainComponent},
    {path: 'main', component: MainComponent},
    {path: 'viewGetRuta', component: ViewGetComponent},
    {path: 'viewPostRuta', component: ViewPostComponent}
];
