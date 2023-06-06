document.addEventListener('DOMContentLoaded', function() {
  const planSelect = document.getElementById('plan-select');
  const competicionesGroup = document.getElementById('competiciones-group');
  
  // Hace que cuando el valor sea principiante se oculten las competiciones.
  if (planSelect.value === 'principiante') {
    competicionesGroup.style.display = 'none';
  }
  
  //Cambia para que cuando se cambie el plan de ejercicios a intermedio o elite se muestre otra vez el apartado de competiciones.
  planSelect.addEventListener('change', (event) => {
    const plan = event.target.value;
    
    if (plan === 'principiante') {
      competicionesGroup.style.display = 'none';
    } else {
      competicionesGroup.style.display = 'block';
    }
  });
});