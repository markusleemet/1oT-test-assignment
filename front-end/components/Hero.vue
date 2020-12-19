<template lang="pug">
  b-jumbotron.hero-component
    template#header
      h1 Weather app
    template#lead This is test assignment for 1oT internship position.
    hr.my-4
    b-button a
    b-button b
</template>

<script lang="js">
export default {
  name: 'Hero'
}
</script>

<style lang="scss">
.hero-component {
  background-image: url("~assets/hero-bg.jpg");
  background-size: cover;
  background-repeat: no-repeat;
  min-height: 500px;
}
</style>
