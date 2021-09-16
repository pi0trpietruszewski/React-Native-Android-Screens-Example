import { NativeModules } from 'react-native';

type AwesomeModuleRnType = {
  showView(): Promise<void>;
  showViewNavigateTo(text?: string): Promise<void>;
};

const { AwesomeModuleRn } = NativeModules;

export default AwesomeModuleRn as AwesomeModuleRnType;
