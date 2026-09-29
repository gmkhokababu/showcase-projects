import { TestBed } from '@angular/core/testing';

import { ControllerrService } from './controllerr.service';

describe('ControllerrService', () => {
  let service: ControllerrService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ControllerrService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
