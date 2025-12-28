import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '',
    redirectTo: '/projects',
    pathMatch: 'full'
  },
  {
    path: 'projects',
    children: [
      {
        path: '',
        loadComponent: () => import('./features/projects/pages/project-list/project-list').then(m => m.ProjectListComponent)
      },
      {
        path: 'new',
        loadComponent: () => import('./features/projects/pages/project-form/project-form').then(m => m.ProjectFormComponent)
      },
      {
        path: ':id',
        loadComponent: () => import('./features/projects/pages/project-details/project-details').then(m => m.ProjectDetailsComponent)
      },
      {
        path: ':id/edit',
        loadComponent: () => import('./features/projects/pages/project-form/project-form').then(m => m.ProjectFormComponent)
      }
    ]
  }
];
