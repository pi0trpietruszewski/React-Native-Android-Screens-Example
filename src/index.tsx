import { NativeModules } from 'react-native';

type AwesomeModuleRnType = {
  multiply(a: number, b: number): Promise<number>;
};

const { AwesomeModuleRn } = NativeModules;

export default AwesomeModuleRn as AwesomeModuleRnType;
