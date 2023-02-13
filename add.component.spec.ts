import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { AddComponent } from './add.component';
import { CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA } from '@angular/core';
import { Student } from 'src/app/Model/Student';


describe('AddComponent', () => {
  let component: AddComponent;
  let fixture: ComponentFixture<AddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddComponent ],
      imports:  [ RouterTestingModule,
        HttpClientTestingModule ],
        schemas: [CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  
  it('Save student way 1', () => {
    const student: Student = {
      idStudent: '2134124132',
      name: 'Ricardo Avila',
      age: '12',
      programa: 'Derecho'
    }
    component.Guardar(student);
  });

  
  
  it('Save student way 2', () => {
    const student: Student = {
      idStudent: '2134124132',
      name: 'Ricardo Avila',
      age: '12',
      programa: 'Derecho'
    }
    component.Guardar2();
  });

});
