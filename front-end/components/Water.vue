<template lang="pug">
  b-container.water-component
    b-row(align-h="around")
      b-col(cols="12" lg="5")
        h4 Sea
        p {{ seaNight }}
      b-col(cols="12" lg="5")
        h4 Peipsi
        p {{ peipsiDay }}
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
    margin-bottom: 2rem;
    text-align: center;
  }
}
</style>
