#import "PushCode.h"

@implementation PushCode

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(add:(int)a withB:(int)b withResolver:(RCTPromiseResolveBlock)resolve withRejecter:(RCTPromiseRejectBlock)reject)
{
  NSNumber *result = @(a + b);
  resolve(result);
}

@end
