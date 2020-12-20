<template lang="pug">
  b-container.water-component
    b-row(align-h="around")
      b-col(cols="12" lg="5")
        h4 Sea
        p {{ seaNight }}
      b-col(cols="12" lg="5").d-flex.flex-column
        h4 Peipsi
        font-awesome-icon.custom-icon(:icon="['fas', 'sun']")
        p {{ peipsiDay }}
        hr.my-2
        font-awesome-icon.custom-icon(:icon="['fas', 'moon']")
        p {{ peipsiNight }}
</template>h

<script lang="js">
export default {
  name: 'Water',
  props: {
    seaDay: {
      type: String,
      default: ''
    },
    peipsiDay: {
      type: String,
      default: ''
    },
    seaNight: {
      type: String,
      default: ''
    },
    peipsiNight: {
      type: String,
      default: ''
    }
  }
}
</script>

<style lang="scss">
.water-component {
  h4{
    text-align: center;
    text-transform: uppercase;
    font-weight: 700;
    margin-top: 1rem;
    margin-bottom: 2rem;
  }
  .custom-icon{
    width: 50px;
    height: 50px;
    margin: 1rem auto;
  }
}
</style>
