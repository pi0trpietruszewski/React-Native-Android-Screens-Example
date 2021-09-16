import React from 'react';
import { View, Button, StyleSheet } from 'react-native';
import ModuleName from 'react-native-awesome-module-rn';

const Main = ({ navigation }: any) => {
  return (
    <View style={styles.container}>
      <Button
        onPress={() => navigation.navigate('Another')}
        title={'RN Screen Screens'}
      />
      <View style={styles.separator} />
      <Button
        onPress={() => ModuleName.showView()}
        title={'Open Native Screens'}
      />
      <View style={styles.separator} />
      <Button
        onPress={() => ModuleName.showViewNavigateTo('second')}
        title={'Open Native Another Screen'}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  separator: { height: 10 },
  container: { alignItems: 'center', justifyContent: 'center', flex: 1 },
});

export default Main;
