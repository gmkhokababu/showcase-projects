import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PreRoomComponent } from './pre-room.component';

describe('PreRoomComponent', () => {
  let component: PreRoomComponent;
  let fixture: ComponentFixture<PreRoomComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PreRoomComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PreRoomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
