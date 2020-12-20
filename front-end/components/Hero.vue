<template lang="pug">
  b-jumbotron.hero-component
    b-container.custom-section
      template#header
        h1.custom-heading Weather app
      template#lead This website is test assignment for 1oT internship position.
        br
        |  It displays Estonian weather information.
      hr.my-4
      b-button(href="#" v-scroll-to="'.today-forecast-component'" variant="success") today forecast
      br
      b-button(href="#" v-scroll-to="'#long-forecast-component'" variant="success") long forecast

</template>

<script lang="js">
export default {
  name: 'Hero'
}
</script>

<style lang="scss">
$success: #407a56;
.hero-component {
  background-image: url("~assets/hero-bg.jpg");
  background-size: cover;
  background-repeat: no-repeat;
  background-position-y: top;
  min-height: 100vh;
  border-radius: 0;
  font-weight: 700;
  h1{
    font-size: 4rem;
    text-transform: uppercase;
  }
  .btn{
    margin: 1rem;
    padding: 1rem;
    display:inline-flex;
    background-color: $success;;
  }
  .custom-section{

  }
}
</style>
