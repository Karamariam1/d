import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ClientService } from '../../services/client.service';
import { Client } from 'src/app/models/client';

@Component({
  selector: 'app-client-add',
  templateUrl: './client-add.component.html',
  styleUrls: ['./client-add.component.css']
})
export class ClientAddComponent {
  client: Client = { nom: '', adresse: '', tele: 0 };

  constructor(private clientService: ClientService, private router: Router) {}

  addClient(): void {
    this.clientService.addClient(this.client).subscribe(() => {
      this.router.navigate(['/clients']);
    });
  }
}
