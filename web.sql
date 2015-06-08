-- phpMyAdmin SQL Dump
-- version 4.0.10.6
-- http://www.phpmyadmin.net
--
-- Хост: 127.0.0.1:3306
-- Время создания: Июн 08 2015 г., 16:20
-- Версия сервера: 5.5.41-log
-- Версия PHP: 5.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `web`
--

-- --------------------------------------------------------

--
-- Структура таблицы `user2`
--

CREATE TABLE IF NOT EXISTS `user2` (
  `Столбец 1` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `user3`
--

CREATE TABLE IF NOT EXISTS `user3` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `year_of` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=14 ;

--
-- Дамп данных таблицы `user3`
--

INSERT INTO `user3` (`id`, `name`, `year_of`) VALUES
(1, 'Джордж Вашингтон', 1789),
(2, 'Джон Адамс', 1797),
(3, 'Томас Джефферсон', 1801),
(4, 'Джеймс Мэдисон', 1809),
(5, 'Джеймс Монро', 1817),
(6, 'Джон Куинси Адамс', 1825),
(7, 'Эндрю Джексон', 1829),
(8, 'Мартин Ван Бюрен', 1837),
(9, 'Уильям Гаррисон', 1841),
(13, '11', 22);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
