import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WonernotificationComponent } from './wonernotification.component';

describe('WonernotificationComponent', () => {
  let component: WonernotificationComponent;
  let fixture: ComponentFixture<WonernotificationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WonernotificationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WonernotificationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
