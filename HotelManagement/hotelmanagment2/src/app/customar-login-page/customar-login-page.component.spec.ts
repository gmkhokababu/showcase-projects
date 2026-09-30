import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomarLoginPageComponent } from './customar-login-page.component';

describe('CustomarLoginPageComponent', () => {
  let component: CustomarLoginPageComponent;
  let fixture: ComponentFixture<CustomarLoginPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CustomarLoginPageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomarLoginPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
