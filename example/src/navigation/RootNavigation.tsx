import 'react-native-gesture-handler';
import * as React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import Main from '../screens/Main';
import 'react-native-gesture-handler';
import Another from '../screens/Another';

const RootNavigation = () => {
  const Stack = createStackNavigator();

  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="Home" component={Main} />
        <Stack.Screen name="Another" component={Another} />
      </Stack.Navigator>
    </NavigationContainer>
  );
};
export default RootNavigation;
