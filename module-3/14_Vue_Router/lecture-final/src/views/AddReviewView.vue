<template>
  <div>
    <h1>Add a review:</h1>
    <add-review v-bind:productId="getProductId"/>
  </div>
</template>

<script>

import AddReview from '../components/AddReview.vue';

export default {
    components: {
        AddReview
    },
    computed: {
        getProductId() {
            return this.$route.params.id
        }
    }

}
</script>

<style>

</style>