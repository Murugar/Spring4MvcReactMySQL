import React from 'react';
import { t } from 'localizify';

var Footer = React.createClass({
  render() {
    return (
      <footer className="footer bg-info" id="footer">
        <div className="text-primary">
          <b>{t('Done By IQMSOFT ')} --> <a href="#">Spring MVC ReactJS --> </a>  
          <span className="js-now-year">2017</span></b>
        </div>
      </footer>
    );
  }
});

export default Footer;