import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

const Another = () => {
  return (
    <View style={styles.container}>
      <Text>Another RN Screen</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: { alignItems: 'center', justifyContent: 'center', flex: 1 },
});

export default Another;
